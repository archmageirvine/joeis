package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131675.
 * @author Sean A. Irvine
 */
public class A131675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131675() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1, 6, 1221, 231880, 13443885, 340203456, 4910472385L, 47565216504L, 342540938025L, 1962871989130L, 9382270310061L, 38701449021984L, 141297910237237L, 465502930269300L, 1404867737405385L, 3930816255364816L});
  }
}
