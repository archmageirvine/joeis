package irvine.oeis.a059;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A059652 a(n) = [[(k^2)*n]-(k*[k*n])], where k = sqrt(3/2) and [] is the floor function.
 * @author Georg Fischer
 */
public class A059652 extends FloorSequence {

  private final CR mK = CR.THREE.divide(CR.TWO).sqrt();

  /** Construct the sequence. */
  public A059652() {
    super(0);
  }

  @Override
  protected Z evalCR(final long n) {
    return CR.valueOf(mK.square().multiply(CR.valueOf(n)).floor())
        .subtract(mK.multiply(mK.multiply(CR.valueOf(n)).floor())).floor();
  }

}
