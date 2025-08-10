package irvine.oeis.a079;

/**
 * A079216.
 * @author Sean A. Irvine
 */
public class A079351 extends A079000 {

  /** Construct the sequence. */
  public A079351() {
    super(1, 3, 4, k -> k.mod(5) == 0);
  }
}
