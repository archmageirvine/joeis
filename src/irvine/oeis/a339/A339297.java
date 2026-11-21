package irvine.oeis.a339;

import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;

/**
 * A339297 Triangle read by rows: T(n,k) is the number of oriented series-parallel networks with n colored elements and without multiple unit elements in parallel using exactly k colors.
 * @author Gregory Morse
 */
public class A339297 extends A339228 {
  @Override
  protected Sequence colorings(final int colors) {
    return new PrependSequence(new A339290(true, colors), 0);
  }
}
