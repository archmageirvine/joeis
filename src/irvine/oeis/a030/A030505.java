package irvine.oeis.a030;

/**
 * A030505 Graham-Sloane-type lower bound on the size of a ternary (n,3,5) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030505 extends A030503 {

  /** Construct the sequence. */
  public A030505() {
    super(5);
  }

  @Override
  protected int w() {
    return 5;
  }
}

