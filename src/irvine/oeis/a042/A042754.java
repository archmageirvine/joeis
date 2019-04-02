package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042754 Numerators of continued fraction convergents to sqrt(908).
 * @author Sean A. Irvine
 */
public class A042754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042754() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 204302, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 211, 241, 452, 6569, 7021, 13590, 102151, 6142650, 43100701, 49243351, 92344052, 1342060079, 1434404131, 2776464210L, 20869653601L});
  }
}
