package irvine.oeis.a131;

/**
 * A131536 Least power of 2 having exactly n consecutive 2's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A131536 extends A131541 {

  @Override
  protected long start() {
    return -1;
  }

  @Override
  protected int getSpecialDigit() {
    return 2;
  }
}

