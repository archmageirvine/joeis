package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;

/**
 * A075456 Distinct-digit averages of two successive perfect powers (pp(n) + pp(n+1))/2.
 * @author Sean A. Irvine
 */
public class A075456 extends FilterSequence {

  /** Construct the sequence. */
  public A075456() {
    super(new A075454(), k -> Functions.MAX.i(ZUtils.digitCounts(k)) == 1);
  }
}
