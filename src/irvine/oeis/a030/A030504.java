package irvine.oeis.a030;

/**
 * A030504 Graham-Sloane-type lower bound on the size of a ternary (n,3,4) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030504 extends A030503 {

  /** Construct the sequence. */
  public A030504() {
    super(4);
  }

  @Override
  protected int w() {
    return 4;
  }
}

