package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A003436 Number of inequivalent labeled Hamiltonian circuits on <code>n-octahedron</code>. Interlacing chords joining <code>2n</code> points on circle.
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

