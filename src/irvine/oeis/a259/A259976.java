package irvine.oeis.a259;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259976.
 * @author Sean A. Irvine
 */
public class A259976 implements Sequence {

  // After Andrey Zabolotskiy

  private int mN = -1;
  private int mQ = 0;

  /*
use num::{Zero, One, rational::Ratio, BigInt};

use integer_partitions::Partitions;

mod polynomial;
use polynomial::Polynomial;

type Int = BigInt;
type Rational = Ratio<Int>;
type RP = Polynomial<Rational>;

fn main() {
	let mut args = std::env::args().skip(1);
	match args.next() {
		None => {
			for p in 0.. {
				let qmax = if p == 0 { 0 } else { p*(p-1)/4 };
				for q in 0..=qmax {
					println!("p={}, q={}: {}", p, q, t(q, p))
				}
				println!();
			}
		},
		Some(ref s) if s == "2" => {
			for q in 0.. {
				println!("{}", t(q, 2*q));
			}
		},
		_ => {
			println!("Run without command line arguments for A259976 or with argument '2' for A005368.");
		}
	}
}
   */

  private int[] rl(final int n, final int[] a) {
    final int[] v = new int[n];
    for (final int x : a) {
      ++v[x - 1];
    }
    return v;
  }
/*
fn rl(n: usize, a: &[usize]) -> Vec<usize> {
	let mut v = vec![0; n];
	for &x in a {
		v[x - 1] += 1;
	}
	v
}
*/

  // generates the polynomial which calculates the character of some symmetric group S_m
  // corresponding to the partition [m-q, q] for a permutation with given set of cycles
  // see F. D. Murnaghan, The theory of group representations, any edition, p. 144
  private CycleIndex xi(final int q) {
    if (q == 0) {
      return CycleIndex.ONE;
    }
    if (q == 1) {
      return new CycleIndex("X(1)", MultivariateMonomial.create(0, 0L, Q.NEG_ONE), MultivariateMonomial.create(1, 1));
    }

//    if (q == 2) {
//      // todo temp explict
//      return new CycleIndex("X(2)", MultivariateMonomial.create(1, 1, new Q(-3, 2)), MultivariateMonomial.create(1, 2, Q.HALF), MultivariateMonomial.create(2, 1));
//    }

    final CycleIndex s = new CycleIndex("X(" + q + ")");
    IntegerPartition pp = new IntegerPartition(q - 1);
    int[] sigma;
    while ((sigma = pp.next()) != null) {
      final int[] r = rl(q - 1, sigma);
      // 		let mut term = RP::from(vec![Rational::from(-2 * Int::from(r[0]) - 1), Rational::one()]) * Rational::new(Int::one(), Int::from(r[0]+1));
      CycleIndex term = new CycleIndex("",
        MultivariateMonomial.create(0, 0, new Q(-2L * r[0] - 1)),
        MultivariateMonomial.create(1, 1)
        );
      term.multiply(new Q(1, r[0] + 1));
      //System.out.println("GGG: " + term + " |r|=" + r.length);
      for (int i = 0; i < r.length; ++i) {
        final int v = r[i];
        for (int j = 1; j <= v; ++j) {
          final CycleIndex copy = term.copy();
          copy.multiply(new Q(1 - j));
          final MultivariateMonomial mm = MultivariateMonomial.create(i + 1, 1);
          term = term.multiply(mm);
          term.add(copy);
          // term = term * (RP::monomial(f.clone(), Rational::one()) - Rational::from(Int::from(j-1))) * Rational::new(Int::one(), Int::from(j));
          term.multiply(new Q(1, j));
        }
      }
      s.add(term);
    }
    pp = new IntegerPartition(q);
    int[] beta;
    while ((beta = pp.next()) != null) {
      final int[] r = rl(q, beta);
      if (r[0] != 0) {
        continue;
      }
      CycleIndex term = CycleIndex.ONE.copy();
      for (int i = 0; i < r.length; ++i) {
        final int v = r[i];
        for (int j = 1; j <= v; ++j) {
          // term = term * (RP::monomial(f.clone(), Rational::one()) - Rational::from(Int::from(j-1))) * Rational::new(Int::one(), Int::from(j));
          final CycleIndex copy = term.copy();
          copy.multiply(new Q(1 - j));
          final MultivariateMonomial mm = MultivariateMonomial.create(i + 1, 1);
          term = term.multiply(mm);
          term.add(copy);
          term.multiply(new Q(1, j));
        }
      }
      s.add(term);
    }
    return s;
  }

  /*

fn xi(q: usize) -> RP {
	if q == 0 {
		return RP::one()
	}
	if q == 1 {
		return RP::from(vec![-Rational::one(), Rational::one()])
	}
	let mut s = RP::zero();
	let mut pp = Partitions::new(q - 1);
	while let Some(sigma) = pp.next() {
		let r = rl(q - 1, sigma);
		let mut term = RP::from(vec![Rational::from(-2 * Int::from(r[0]) - 1), Rational::one()]) * Rational::new(Int::one(), Int::from(r[0]+1));
		for (i, &v) in r.iter().enumerate() {
			let mut f = vec![0; q];
			f[i] = 1;
			for j in 1..=usize::from(v) {
				term = term * (RP::monomial(f.clone(), Rational::one()) - Rational::from(Int::from(j-1))) * Rational::new(Int::one(), Int::from(j));
			}
		}
		s = s + term;
	}
	let mut pp = Partitions::new(q);
	while let Some(beta) = pp.next() {
		let r = rl(q, beta);
		if !r[0].is_zero() {
			continue
		}
		let mut term = RP::one();
		for (i, &v) in r.iter().enumerate() {
			let mut f = vec![0; q];
			f[i] = 1;
			for j in 1..=v {
				term = term * (RP::monomial(f.clone(), Rational::one()) - Rational::from(Int::from(j-1))) * Rational::new(Int::one(), Int::from(j));
			}
		}
		s = s + term;
	}
	s
}
*/

  private long[] cycles(final List<Integer> p) {
    final long[] r = new long[p.size() + 1];
    for (int i0 = 0; i0 < p.size(); ++i0) {
      int i = i0;
      int j = 1;
      while (p.get(i) > i0) {
        i = p.get(i);
        ++j;
      }
      if (p.get(i) == i0) {
        ++r[j];
      }
    }
    return r;
  }

  private List<Z> cycles2(final List<Integer> p) {
    final List<Z> r = new ArrayList<>();
    for (int i0 = 0; i0 < p.size(); ++i0) {
      int i = i0;
      int j = 0;
      while (p.get(i) > i0) {
        i = p.get(i);
        ++j;
      }
      while (j >= r.size()) {
        r.add(Z.ZERO);
      }
      if (p.get(i) == i0) {
        r.set(j, r.get(j).add(1));
      }
    }
    return r;
  }
  /*
fn cycles(p: Vec<usize>) -> Vec<Int> {
// counts cycles of each length in a permutation
	let mut r = vec![Int::zero(); p.len()];
	for i0 in 0..p.len() {
		let mut i = i0;
		let mut j = 0;
		while p[i] > i0 {
			i = p[i];
			j += 1;
		}
		if p[i] == i0 {
			r[j] += Int::one();
		}
	}
	r
}
*/


  private List<Integer> edges(final List<Integer> p) {
    final ArrayList<Integer> r = new ArrayList<>();
    for (int v2 = 0; v2 < p.size(); ++v2) {
      final int u2 = p.get(v2);
      for (int v1 = 0; v1 < v2; ++v1) {
        final int u1 = p.get(v1);
        final int w1, w2;
        if (u1 < u2) {
          w1 = u1;
          w2 = u2;
        } else {
          w1 = u2;
          w2 = u1;
        }
        r.add(w2 * (w2 - 1) / 2 + w1);
      }
    }
    return r;
  }
/*
fn edges(p: Vec<usize>) -> Vec<usize> {
// turns a permutation of vertices of K_p into a permutation of its edges
	let mut r = Vec::new();
	for (v2, w2) in p.iter().enumerate() {
		for (v1, w1) in p.iter().enumerate() {
			if v1 >= v2 {
				break
			}
			let (w1, w2) = if w1 < w2 { (w1, w2) } else { (w2, w1) };
			r.push(w2*(w2-1)/2+w1);
		}
	}
	r
}
   */

  // Constructs a permutation from cycles
  private List<Integer> fromCycles(final int[] pp) {
    final List<Integer> perm = new ArrayList<>();
    int s = 0;
    //for (int k = pp.length - 1; k >= 0; --k) {
    // final int cyc = pp[k];
    for (final int cyc : pp) {
      for (int i = 1; i < cyc; ++i) {
        perm.add(s + i);
      }
      perm.add(s);
      s += cyc;
    }
    return perm;
//  fn from_cycles(pp: &[usize]) -> Vec<usize> {
//
//    let mut perm = Vec::new();
//    let mut s = 0;
//    for &cyc in pp {
//      for i in 1..cyc {
//        perm.push(s + i)
//      }
//      perm.push(s);
//      s += cyc;
//    }
//    perm
  }

  private final MemoryFactorial mF = new MemoryFactorial();

  // See Merris & Watkins paper, pp. 539-541
  private Z t(final int q, final int p) {
    if (q == 0) {
      return Z.ONE;
    }

    final CycleIndex xiq = xi(q); // todo cache these?
    System.out.println("xiq=" + xiq);
    Q r = Q.ZERO;
    final IntegerPartition ppp = new IntegerPartition(p);
    int[] pp;
    while ((pp = ppp.next()) != null) {
      final Q t = new Q(IntegerPartition.permCount(pp), mF.factorial(p)); // todo could this be wrong?
      if (p == 4 && q == 3) {
        System.out.println(Arrays.toString(pp) + " permcount=" + t);
      }
      // todo why are these two things different
      final long[] sigma = cycles(edges(fromCycles(pp)));
      //final List<Z> sigma = cycles2(edges(fromCycles(pp)));
      System.out.println(Arrays.toString(pp) + " -> " + cycles2(edges(fromCycles(pp))) + " cf. " + Arrays.toString(cycles(edges(fromCycles(pp)))));
      r = r.add(xiq.eval(sigma).multiply(t));
    }
    assert r.isInteger();
    return r.toZ();

    /*
	let xiq = xi(q); // cache?
	let mut r = Rational::zero();
	let mut ppp = Partitions::new(p);
	while let Some(pp) = ppp.next() {
		let t = // number of partitions with set of cycles pp divided by p!
			Rational::new(Int::one(),
			Int::from(pp.iter().product::<usize>()) *
			rl(p, pp).iter().map(|&x| { (1..=x).map(|n| { Int::from(n) }).product::<Int>() }).product::<Int>());
		let sigma = cycles(edges(from_cycles(pp)));
		r += xiq.eval(sigma) * t;
	}
	if !r.is_integer() { panic!("T(p={}, q={}) = {} is not integer", p, q, r) };
	r.to_integer()
}
     */
  }

  @Override
  public Z next() {
    final int qmax = mN * (mN - 1) / 4;
    if (++mQ > qmax) {
      ++mN;
      mQ = 0;
    }
    System.out.println("p=" + mN + ", q=" + mQ);
    return t(mQ, mN);
  }
}
