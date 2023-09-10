package irvine.oeis.a354;
// manually recval at 2023-09-10 18:32

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.a076.A076978;

/**
 * A354218 Records in A076978, divided by 2.
 * @author Georg Fischer
 */
public class A354218 extends RecordSequence {

  /** Construct the sequence. */
  public A354218() {
    super(1, new A076978());
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
