package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a066.A066925;

/**
 * A068347 Number of partitions of A066925(n) into x_i parts.
 * @author Sean A. Irvine
 */
public class A068347 extends A066925 {

  private final HashSet<String> mSolutions = new HashSet<>();

  private void findSolutions(final long n, final long x, final long[] terms, final int pos, final List<Long> soln) {
    if (pos >= terms.length || x < 0) {
      return;
    }
    if (x == 0) {
      Collections.sort(soln);
      mSolutions.add(soln.toString());
      return;
    }
    if (n % terms[pos] == 0) {
      final List<Long> s2 = new ArrayList<>(soln);
      s2.add(terms[pos]);
      s2.add(n / terms[pos]);
      findSolutions(n, x - terms[pos] - n / terms[pos], terms, pos, s2);
    }
    findSolutions(n, x, terms, pos + 1, soln);
  }

  @Override
  public Z next() {
    final long t = super.next().longValueExact();
    if (t == 1) {
      return Z.ONE;
    }
    mSolutions.clear();
    final long[] terms = ZUtils.toLong(Jaguar.factor(t).divisorsSorted());
    findSolutions(t, t, terms, 0, new ArrayList<>());
    if (Predicates.SQUARE.is(t)) {
      final long s = Functions.SQRT.l(t);
      final List<Long> s1 = new ArrayList<>();
      long q = t;
      while (q - s >= 0) {
        s1.add(s);
        q -= s;
        findSolutions(t, q, terms, 0, s1);
      }
    }
    //System.out.println(mSolutions);
    return Z.valueOf(mSolutions.size());
  }
}
