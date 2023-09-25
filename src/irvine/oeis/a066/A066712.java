package irvine.oeis.a066;
// manually inverse at 2023-09-24 23:12

import irvine.oeis.InverseSequence;
import irvine.oeis.a032.A032445;

/**
 * A066712 Inverse of A032445, with first appearance of string &quot;0&quot; in decimal expansion of Pi added to A032445.
 * @author Georg Fischer
 */
public class A066712 extends InverseSequence {

  /** Construct the sequence. */
  public A066712() {
    super(new A032445(), 1, 0);
  }
}
