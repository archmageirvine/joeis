package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016844 <code>(4n+3)^8</code>.
 * @author Sean A. Irvine
 */
public class A016844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016844() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 5764801, 214358881, 2562890625L, 16983563041L, 78310985281L, 282429536481L, 852891037441L, 2251875390625L});
  }
}
