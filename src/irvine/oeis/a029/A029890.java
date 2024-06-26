package irvine.oeis.a029;

import irvine.math.function.Functions;

/**
 * A029890 Number of odd graphical partitions.
 * @author Sean A. Irvine
 */
public class A029890 extends A029889 {

  /** Construct the sequence. */
  public A029890() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  protected boolean accept(final int[] rowSums) {
    return (Functions.SUM.l(rowSums) & 1) == 1;
  }
}
