package irvine.oeis.a030;

/**
 * A030510 Graham-Sloane-type lower bound on the size of a ternary (n,3,10) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030510 extends A030503 {

  /** Construct the sequence. */
  public A030510() {
    super(10);
  }

  @Override
  protected int w() {
    return 10;
  }
}

