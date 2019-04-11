package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017422 <code>(11n+2)^10</code>.
 * @author Sean A. Irvine
 */
public class A017422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017422() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1024), Z.valueOf(137858491849L), Z.valueOf(63403380965376L), Z.valueOf(2758547353515625L), Z.valueOf(42420747482776576L), Z.valueOf(362033331456891249L), Z.valueOf(2113922820157210624L), new Z("9468276082626847201"), new Z("34867844010000000000"), new Z("110462212541120451001"), new Z("310584820834420916224")});
  }
}
