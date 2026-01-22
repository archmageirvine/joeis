package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A392480 allocated for Michael S. Branicky.
 * @author Sean A. Irvine
 */
public class A392480 extends FilterSequence {

  /** Construct the sequence. */
  public A392480() {
    super(1, new A000290(), k -> Functions.MAX.i(ZUtils.digitCounts(k)) > 1);
  }
}
