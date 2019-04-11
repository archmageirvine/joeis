package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042756 Numerators of continued fraction convergents to <code>sqrt(909)</code>.
 * @author Sean A. Irvine
 */
public class A042756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042756() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 161602, 0, 0, 0, 0, 0, 0, 0}, new long[] {30, 181, 211, 603, 3829, 8261, 12090, 80801, 4860150, 29241701, 34101851, 97445403, 618774269, 1334993941, 1953768210, 13057603201L});
  }
}
