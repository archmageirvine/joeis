package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-05/parmof3 at 2024-04-05 23:22

/**
 * A070097 Number of integer triangles with perimeter n and prime side lengths which are both acute and scalene.
 * @author Georg Fischer
 */
public class A070097 extends A070080 {

  /** Construct the sequence. */
  public A070097() {
    super(1, COUNT, s -> isAcute(s) && isScalene(s) && hasPrimeSides(s));
  }
}
