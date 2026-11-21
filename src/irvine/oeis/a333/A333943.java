package irvine.oeis.a333;

/**
 * A333943 Numbers k such that the k-th composition in standard order is a reversed necklace.
 * @author Gregory Morse
 */
public class A333943 extends A333764 {
  @Override
  protected boolean accept(final int[] parts) {
    for (int left = 0, right = parts.length - 1; left < right; ++left, --right) {
      final int t = parts[left];
      parts[left] = -parts[right];
      parts[right] = -t;
    }
    if ((parts.length & 1) != 0) {
      parts[parts.length / 2] = -parts[parts.length / 2];
    }
    return super.accept(parts);
  }
}
