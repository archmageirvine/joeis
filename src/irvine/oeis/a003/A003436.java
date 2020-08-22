package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A003436 Number of inequivalent labeled Hamiltonian circuits on n-octahedron. Interlacing chords joining 2n points on circle.
 * @author Sean A. Irvine
 */
public class A003436 extends PrependSequence {

  /** Construct the sequence. */
  public A003436() {
    super(new A003435() {
      @Override
      public Z next() {
        return super.next().shiftRight(mN).divide(mF.factorial(mN));
      }
    }, Z.ONE, Z.ZERO);
  }
}

