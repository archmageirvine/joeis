package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017360 <code>a(n) = (10*n + 7)^8</code>.
 * @author Sean A. Irvine
 */
public class A017360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017360() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {5764801, 6975757441L, 282429536481L, 3512479453921L, 23811286661761L, 111429157112001L, 406067677556641L, 1235736291547681L, 3282116715437121L});
  }
}
