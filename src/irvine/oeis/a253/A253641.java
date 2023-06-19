package irvine.oeis.a253;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052409;

/**
 * A253641 Largest integer b such that n=a^b for some integer a; a(0)=a(1)=1 by convention.
 * @author Georg Fischer
 */
public class A253641 extends PrependSequence {

  /** Construct the sequence. */
  public A253641() {
    super(new A052409().skip(1), 1, 1);
  }
}
