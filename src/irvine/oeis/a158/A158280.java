package irvine.oeis.a158;

import irvine.math.z.Z;
import irvine.oeis.a145.A145511;

/**
 * A158280 Octosection: A145511(8n+4) or A145501(8n+4).
 * @author Georg Fischer
 */
public class A158280 extends A145511 {

  /** Construct the sequence. */
  public A158280() {
  }

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
