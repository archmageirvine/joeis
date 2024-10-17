package irvine.oeis.a165;
// manually 2024-10-09/multrar at 2024-10-11 10:08

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008615;

/**
 * A165686 Dimension of the space of Siegel cusp forms of genus 2 and weight 2k which are not Saito-Kurokawa lifts of forms of genus 1.
 * @author Georg Fischer
 */
public class A165686 extends AbstractSequence {

  private static final DirectSequence A008615 = new A008615();
  private static final Sequence A165684 = new A165684();

  private int mN;
  
  /** Construct the sequence. */
  public A165686() {
    super(1);
    mN = 0;
    A165684.next();
    A165684.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 2) ? Z.ZERO : A165684.next().subtract(A008615.a(2 * mN - 5));
  }
}
