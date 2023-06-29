package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a048.A048617;

/**
 * A063965 Size of the automorphism group of the group S_n x S_n (where S_n is the symmetric group).
 * @author Sean A. Irvine
 */
public class A063965 extends PrependSequence {

  /** Construct the sequence. */
  public A063965() {
    super(1, new SkipSequence(new A048617(), 7), 1, 6, 72, 1152, 28800, 4147200);
  }
}

