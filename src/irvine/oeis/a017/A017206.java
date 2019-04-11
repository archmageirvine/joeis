package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017206 <code>a(n) = (9*n + 3)^10</code>.
 * @author Sean A. Irvine
 */
public class A017206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017206() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new Z[] {Z.valueOf(59049), Z.valueOf(61917364224L), Z.valueOf(16679880978201L), Z.valueOf(590490000000000L), Z.valueOf(8140406085191601L), Z.valueOf(64925062108545024L), Z.valueOf(362033331456891249L), Z.valueOf(1568336880910795776L), Z.valueOf(5631351470947265625L), new Z("17490122876598091776"), new Z("48398230717929318249")});
  }
}
