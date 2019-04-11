package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041979 Denominators of continued fraction convergents to <code>sqrt(512)</code>.
 * @author Sean A. Irvine
 */
public class A041979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041979() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1331714, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 8, 51, 569, 3465, 7499, 10964, 18463, 29427, 1313251, 1342678, 2655929, 3998607, 10653143, 67917465, 757745258, 4614389013L, 9986523284L, 14600912297L, 24587435581L, 39188347878L});
  }
}
