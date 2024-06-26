package irvine.oeis.a270;
// Generated by gen_seq4.pl 2024-03-30/prepend at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.PrependSequence;

/**
 * A270804 0 followed by the positions of the 1's in the inverse Thue-Morse sequence A270803.
 * @author Georg Fischer
 */
public class A270804 extends PrependSequence {

  /** Construct the sequence. */
  public A270804() {
    super(0, new FilterPositionSequence(0, 0, new A270803(), Z.ONE), 0);
  }
}
