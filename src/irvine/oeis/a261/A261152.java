package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261152 a(n) =  161004359399459161 + (n-1)*10644900609172830.
 * @author Sean A. Irvine
 */
public class A261152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261152() {
    super(new long[] {-1, 2}, new long[] {161004359399459161L, 171649260008631991L});
  }
}
