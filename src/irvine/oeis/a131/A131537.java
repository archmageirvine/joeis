package irvine.oeis.a131;

/**
 * A131537 Least exponent k such that 2^k has exactly n consecutive 3's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A131537 extends A131541 {

  @Override
  protected int getSpecialDigit() {
    return 3;
  }

}

