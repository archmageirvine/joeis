package irvine.oeis.a131;

/**
 * A131535 Least power of 2 having exactly n consecutive 1's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A131535 extends A131541 {

  /** Construct the sequence. */
  public A131535() {
    super(0);
  }

  @Override
  protected long start() {
    return -1;
  }

  @Override
  protected int getSpecialDigit() {
    return 1;
  }
}

