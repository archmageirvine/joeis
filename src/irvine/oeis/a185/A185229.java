package irvine.oeis.a185;
// Generated by gen_seq4.pl 2024-06-02/multraf at 2024-06-02 23:31

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A185229 Number of disconnected 2-regular simple graphs on n vertices with girth at least 9.
 * @author Georg Fischer
 */
public class A185229 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A185229() {
    super(0, (self, n) -> self.s(0).subtract(self.s(1)), "", new A185329(), new A185119());
  }
}
