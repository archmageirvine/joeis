package irvine.oeis.a030;

/**
 * A030509 Graham-Sloane-type lower bound on the size of a ternary (n,3,9) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030509 extends A030503 {

  /** Construct the sequence. */
  public A030509() {
    super(9);
  }

  @Override
  protected int w() {
    return 9;
  }
}

