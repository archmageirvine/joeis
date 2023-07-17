package irvine.oeis.a030;

/**
 * A030508 Graham-Sloane-type lower bound on the size of a ternary (n,3,8) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030508 extends A030503 {

  /** Construct the sequence. */
  public A030508() {
    super(8);
  }

  @Override
  protected int w() {
    return 8;
  }
}

