package irvine.oeis.a286;

import irvine.oeis.triangle.Transpose;

/**
 * A286564 Triangular table A286563 reversed.
 * @author Georg Fischer
 */
public class A286564 extends Transpose {

  /** Construct the sequence. */
  public A286564() {
    super(1, new A286563());
  }
}
