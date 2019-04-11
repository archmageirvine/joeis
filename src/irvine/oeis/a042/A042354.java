package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042354 Numerators of continued fraction convergents to <code>sqrt(704)</code>.
 * @author Sean A. Irvine
 */
public class A042354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042354() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 158402, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 27, 53, 398, 5227, 36987, 42214, 79201, 4160666, 4239867, 8400533, 63043598, 827967307, 5858814747L, 6686782054L, 12545596801L});
  }
}
