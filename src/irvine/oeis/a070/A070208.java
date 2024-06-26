package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-05/parmof3 at 2024-04-05 23:22

/**
 * A070208 Number of integer triangles with perimeter n having integral area but not integral inradius.
 * @author Georg Fischer
 */
public class A070208 extends A070080 {

  /** Construct the sequence. */
  public A070208() {
    super(1, COUNT, s -> hasIntArea(s) && !hasIntInRadius(s));
  }
}
