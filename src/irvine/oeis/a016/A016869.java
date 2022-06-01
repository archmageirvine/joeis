package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016869 (5n+1)^9.
 * @author Sean A. Irvine
 */
public class A016869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016869() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 10077696, 2357947691L, 68719476736L, 794280046581L, 5429503678976L, 26439622160671L, 101559956668416L, 327381934393961L, 922190162669056L});
  }
}
