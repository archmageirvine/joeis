package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016892.
 * @author Sean A. Irvine
 */
public class A016892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016892() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 16777216, 815730721, 11019960576L, 78310985281L, 377801998336L, 1406408618241L, 4347792138496L, 11688200277601L});
  }
}
