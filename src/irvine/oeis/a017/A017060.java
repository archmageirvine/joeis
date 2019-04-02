package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017060 a(n) = (7*n + 6)^8.
 * @author Sean A. Irvine
 */
public class A017060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017060() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1679616, 815730721, 25600000000L, 282429536481L, 1785793904896L, 7984925229121L, 28179280429056L, 83733937890625L, 218340105584896L});
  }
}
