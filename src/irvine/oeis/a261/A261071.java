package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.a050.A050923;

/**
 * A261071 a(n) = 2^(n!) + 1.
 * @author Georg Fischer
 */
public class A261071 extends A050923 {

  /** Construct the sequence. */
  public A261071() {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
