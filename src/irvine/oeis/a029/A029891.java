package irvine.oeis.a029;

import irvine.math.function.Functions;

/**
 * A029891 Number of even graphical partitions.
 * @author Sean A. Irvine
 */
public class A029891 extends A029889 {

  /** Construct the sequence. */
  public A029891() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  protected boolean accept(final int[] rowSums) {
    return (Functions.SUM.l(rowSums) & 1) == 0;
  }
}
