package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144380 Third subdiagonal of A142458: <code>a(n) =</code> A142458(n+3,n).
 * @author Sean A. Irvine
 */
public class A144380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144380() {
    super(new long[] {-31360, 161056, -347112, 409062, -289173, 127548, -35679, 6294, -675, 40}, new long[] {1, 166, 5482, 109640, 1709675, 23077694, 284433852, 3300384000L, 36740695125L, 397251942790L});
  }
}
