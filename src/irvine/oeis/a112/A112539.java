package irvine.oeis.a112;

import irvine.math.z.Z;

/**
 * A112539 Half-baked Thue-Morse: at successive steps the sequence or its bit-inverted form is appended to itself.
 * @author Georg Fischer
 */
public class A112539 extends A112865 {


  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return result.equals(Z.ONE) ? result : Z.ZERO;
  }
}
