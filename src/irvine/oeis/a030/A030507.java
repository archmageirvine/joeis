package irvine.oeis.a030;

/**
 * A030507 Graham-Sloane-type lower bound on the size of a ternary (n,3,7) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030507 extends A030503 {

  /** Construct the sequence. */
  public A030507() {
    super(7);
  }

  @Override
  protected int w() {
    return 7;
  }
}

