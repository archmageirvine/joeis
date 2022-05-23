package irvine.oeis.a051;

import irvine.oeis.InverseSequence;

/**
 * A051586 There are exactly n integer-sided triangles of area a(n).
 * @author Sean A. Irvine
 */
public class A051586 extends InverseSequence {

  /** Construct the sequence. */
  public A051586() {
    super(new A051584());
  }
}
