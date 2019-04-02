package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.a006.A006387;

/**
 * A214814 Number of unsensed genus 2 maps with n edges.
 * @author T. R. S. Walsh
 */
public class A214814 extends A006387 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(count(2, ++mN, 1, mN + 1, false)[2]);
  }
}
