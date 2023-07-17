package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A006156 Number of ternary squarefree words of length n.
 * @author Sean A. Irvine
 */
public class A006156 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006156(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006156() {
    super(0);
  }

  protected ArrayList<String> mWords = new ArrayList<>();

  protected char maxLetter() {
    return 'c';
  }

  @Override
  public Z next() {
    if (mWords.isEmpty()) {
      mWords.add("");
    } else {
      final ArrayList<String> next = new ArrayList<>();
      for (final String w : mWords) {
        for (char letter = 'a'; letter <= maxLetter(); ++letter) {
          final String a = letter + w;
          if (StringUtils.isSquareFreeWord(a)) {
            next.add(a);
          }
        }
      }
      mWords = next;
    }
    return Z.valueOf(mWords.size());
  }
}

