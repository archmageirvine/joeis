package irvine.oeis.a060;
// manually A060164/parm2 at 2022-03-25 08:46

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000670;

/**
 * A060223 Number of orbits of length n under the map whose periodic points are counted by A000670.
 * @author Georg Fischer
 */
public class A060223 extends PrependSequence {

  /** Construct the sequence. */
  public A060223() {
    super(new A060164(new A000670()), 1);
  }
}
