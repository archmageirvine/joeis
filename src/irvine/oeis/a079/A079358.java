package irvine.oeis.a079;

/**
 * A079216.
 * @author Sean A. Irvine
 */
public class A079358 extends A079000 {

  /** Construct the sequence. */
  public A079358() {
    super(1, 1, 4, k -> k.mod(3) != 0 && k.mod(4) != 0);
  }
}
