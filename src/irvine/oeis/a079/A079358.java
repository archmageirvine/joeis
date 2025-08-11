package irvine.oeis.a079;

/**
 * A079358 a(n) is taken to be the smallest positive integer greater than a(n-1) which is consistent with the condition "n is a member of the sequence if and only if a(n) is not a multiple of either 3 or 4.".
 * @author Sean A. Irvine
 */
public class A079358 extends A079000 {

  /** Construct the sequence. */
  public A079358() {
    super(1, 1, 4, k -> k.mod(3) != 0 && k.mod(4) != 0);
  }
}
