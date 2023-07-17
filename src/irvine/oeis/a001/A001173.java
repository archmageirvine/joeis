package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000595;

/**
 * A001173 Half the number of binary relations on n unlabeled points.
 * @author Sean A. Irvine
 */
public class A001173 extends A000595 {

  /** Construct the sequence. */
  public A001173() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

