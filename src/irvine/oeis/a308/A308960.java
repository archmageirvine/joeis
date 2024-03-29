package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308960 Sum of the largest parts in the partitions of n into 7 squarefree parts.
 * a(n)=sum(o=1,floor(n/7),sum(m=o,floor((n-o)/6),sum(l=m,floor((n-m-o)/5),sum(k=l,floor((n-l-m-o)/4),sum(j=k,floor((n-k-l-m-o)/3),sum(i=j,floor((n-j-k-l-m-o)/2),(n-i-j-k-l-m-o)*moebius(o)^2*moebius(m)^2*moebius(l)^2*moebius(k)^2*moebius(j)^2*moebius(i)^2*moebius(n-i-j-k-l-m-o)^2))))))
 * @author Georg Fischer
 */
public class A308960 extends LambdaSequence {

  /** Construct the sequence. */
  public A308960() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 7, o -> Integers.SINGLETON.sum(o, (n - o) / 6, m -> Integers.SINGLETON.sum(m, (n - m - o) / 5, l -> Integers.SINGLETON.sum(l, (n - l - m - o) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l - m - o) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l - m - o) / 2, i -> Z.valueOf(n - i - j - k - l - m - o).multiply(Z.valueOf(Mobius.mobius(o)).square()).multiply(Z.valueOf(Mobius.mobius(m)).square()).multiply(Z.valueOf(Mobius.mobius(l)).square()).multiply(Z.valueOf(Mobius.mobius(k)).square()).multiply(Z.valueOf(Mobius.mobius(j)).square()).multiply(Z.valueOf(Mobius.mobius(i)).square()).multiply(Z.valueOf(Mobius.mobius(n - i - j - k - l - m - o)).square()))))))));
  }
}
